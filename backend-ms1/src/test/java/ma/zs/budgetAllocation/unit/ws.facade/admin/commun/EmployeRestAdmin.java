package ma.zs.budgetAllocation.unit.ws.facade.admin.commun;

import ma.zs.budgetAllocation.bean.core.commun.Employe;
import ma.zs.budgetAllocation.service.impl.admin.commun.EmployeAdminServiceImpl;
import ma.zs.budgetAllocation.ws.converter.commun.EmployeConverter;
import ma.zs.budgetAllocation.ws.dto.commun.EmployeDto;
import ma.zs.budgetAllocation.ws.facade.admin.commun.EmployeRestAdmin;
import org.aspectj.lang.annotation.Before;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private EmployeAdminServiceImpl service;
    @Mock
    private EmployeConverter converter;

    @InjectMocks
    private EmployeRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllEmployeTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<EmployeDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<EmployeDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveEmployeTest() throws Exception {
        // Mock data
        EmployeDto requestDto = new EmployeDto();
        Employe entity = new Employe();
        Employe saved = new Employe();
        EmployeDto savedDto = new EmployeDto();

        // Mock the converter to return the employe object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved employe DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<EmployeDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        EmployeDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved employe DTO
        assertEquals(savedDto.getNom(), responseBody.getNom());
        assertEquals(savedDto.getPrenom(), responseBody.getPrenom());
    }

}
