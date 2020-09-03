package com.example.sample.app.welcome;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;

import java.util.Locale;

import org.junit.Test;
import org.springframework.ui.Model;

public class HelloControllerTest {

    @Test
    public void test() {
        HelloController controller = new HelloController();
        Model model = spy(Model.class);
        String result = controller.home(Locale.JAPAN, model);
        assertThat(result, is("welcome/home"));
    }

}
