import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {
    @Test
    public void hello_world_test(){
        assertThat("Hello World", is("Hello World"));
    }

    @Test
    public void should_be_mocked(){
        HelloWorld helloWorld = mock(HelloWorld.class);
        when(helloWorld.beenCalled()).thenReturn("Hello World");

        assertThat(helloWorld.beenCalled(), is("Hello World"));
    }
}
