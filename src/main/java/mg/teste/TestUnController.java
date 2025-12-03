package mg.teste;
import com.monframework.annotation.MyController;
import com.monframework.annotation.HandleUrl;

@MyController(value = "Test1")
public class TestUnController {

    @HandleUrl(value = "test1url1")
    public void url1(){

    }
}
