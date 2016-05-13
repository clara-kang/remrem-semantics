import com.ericsson.eiffel.remrem.message.services.MsgService;
import java.util.Map;
import com.google.gson.JsonObject;

public class Library implements MsgService{

    @Override
    public String generateMsg(String msgType, JsonObject msgNodes, Map<String, String> eventParams){
        return "string";
    }
}
