//package fpt.gymmanagement.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import fpt.gymmanagement.config.security.filter.JwtAuthenticationFilter;
//import fpt.gymmanagement.dto.BlogDTO;
//import fpt.gymmanagement.entity.BlogType;
//import fpt.gymmanagement.processor.BlogProcessor;
//import fpt.gymmanagement.service.BlogTypeService;
//import fpt.gymmanagement.service.UserService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.web.server.ResponseStatusException;
//
//import javax.validation.Validation;
//import javax.validation.Validator;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class BlogControllerTest {
//    @Autowired BlogProcessor processor;
//    @Autowired UserService userService;
//    @Autowired BlogTypeService blogTypeService;
//    @Autowired Validator validator;
//    @Autowired MockMvc mvc;
//    @Autowired JwtAuthenticationFilter jwtAuthenticationFilter;
//
//    @BeforeEach
//    void setup() {
//        processor = Mockito.mock(BlogProcessor.class);
//        userService = Mockito.mock(UserService.class);
//        blogTypeService = Mockito.mock(BlogTypeService.class);
//        validator = Validation.buildDefaultValidatorFactory().getValidator();
//        jwtAuthenticationFilter = Mockito.mock(JwtAuthenticationFilter.class);
//    }
//
//    //SET UP TEST CASE
//    private BlogDTO initialSuccess() {
//        return BlogDTO.builder()
//                .content("Đi ăn rau")
//                .title("Ăn uống")
//                .attach_url("dasdas")
//                .branchId("1")
//                .typeId("1")
//                .build();
//    }
//
//    private BlogDTO initialErrorContent() {
//        return BlogDTO.builder()
//                .title("Ăn uống")
//                .attach_url("dasdas")
//                .branchId("1")
//                .typeId("1")
//                .build();
//    }
//
//    private BlogDTO initialErrorTitle() {
//        return BlogDTO.builder()
//                .content("HAHAHAH")
//                .attach_url("dasdas")
//                .branchId("1")
//                .typeId("1")
//                .build();
//    }
//
//    private BlogType initialBlogType() {
//        BlogType blogType = new BlogType();
//        blogType.setId("1");
//        blogType.setName("Ăn uống");
//        return blogType;
//    }
//
////    @Test
////    void testCreateSuccess() {
////        BlogDTO dto = initialSuccess();
////        BlogDTO response = BlogDTO.builder().id("1").content("Đi ăn rau").title("Ăn uống").attach_url("dasdas").branchId("1").typeId("1").build();
////        Mockito.when(processor.saveOrUpdate(dto, null)).thenReturn(response);
////        var result = processor.saveOrUpdate(dto, null);
////        Assertions.assertEquals(result, response);
////    }
////
////    @Test
////    void testCreateError() {
////        BlogDTO dto = initialError();
////        BlogDTO response = BlogDTO.builder().id("1").content("Đi ăn rau").title("Ăn uống").attach_url("dasdas").branchId("1").typeId("1").build();
////        Mockito.when(processor.saveOrUpdate(dto, null)).thenReturn(response);
////        var result = processor.saveOrUpdate(dto, null);
////        Assertions.assertEquals(result, response);
////    }
//
//    @Test
//    void testCreateErrorContent() throws Exception {
//        BlogDTO dto = initialErrorContent();
//        String json = new ObjectMapper().writeValueAsString(dto);
//        MvcResult result = mvc.perform(post("/blogs")
//                .content(json)
//                        .contentType(MediaType.APPLICATION_JSON)
//                .header("Authorization", "Bearer " + CommonTest.TOKEN_ADMIN))
//                .andExpect(status().isBadRequest()).andReturn();
//        String x = result.getResolvedException().getMessage();
//        Assertions.assertTrue(x.contains("Nội dung blog không được bỏ trống"));
//    }
//
//    @Test
//    void testCreateErrorTitle() throws Exception {
//        BlogDTO dto = initialErrorTitle();
//        String json = new ObjectMapper().writeValueAsString(dto);
//        MvcResult result = mvc.perform(post("/blogs")
//                .content(json)
//                        .contentType(MediaType.APPLICATION_JSON)
//                .header("Authorization", "Bearer " + CommonTest.TOKEN_ADMIN))
//                .andExpect(status().isBadRequest()).andReturn();
//        String x = result.getResolvedException().getMessage();
//        Assertions.assertTrue(x.contains("Tiêu đề blog không được bỏ trống"));
//    }
//
//    @Test
//    void testCreateSuccess() throws Exception {
//        BlogDTO dto = initialSuccess();
//        String json = new ObjectMapper().writeValueAsString(dto);
//        MvcResult result = mvc.perform(post("/blogs")
//                        .content(json)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .header("Authorization", "Bearer " + CommonTest.TOKEN_ADMIN))
//                .andExpect(status().isBadRequest()).andReturn();
//
//    }
//}
