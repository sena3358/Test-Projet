package mg.teste;
import com.monframework.annotation.MyController;
import com.monframework.annotation.HandleUrl;

@MyController(value = "test2")
public class TestDeuxController {
    @HandleUrl(value = "test2url1")
    public void url1(){

    }
}
