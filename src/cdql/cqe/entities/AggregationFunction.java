package cdql.cqe.entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ali on 14/02/2017.
 */
public class AggregationFunction extends ContextFunction {

    private String URL;

    public AggregationFunction(String functionTitle, String URL) {
        super(functionTitle);
        this.URL = URL;
    }

    public AggregationFunction(String functionTitle) {
        super(functionTitle);
    }



    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String execute(Map<String,String> arguments) {
        
        return "";
    }
}
