package thomas.champenois.channelmessaging;

import java.util.HashMap;

/**
 * Created by champent on 19/01/2018.
 */
public class PostRequest {

    private String URL;
    private HashMap<String,String> params;

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setParams(HashMap<String, String> params) {
        this.params = params;
    }

    public String getURL() {

        return URL;
    }

    public HashMap<String, String> getParams() {
        return params;
    }


}
