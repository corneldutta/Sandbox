package transform;

import io.cucumber.cucumberexpressions.Transformer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransformDate implements Transformer<String> {

    @Override
    public String transform(String str) throws Throwable {
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date=null;
        try
        {
            date = input.parse(str);
        }catch (ParseException e)
        {
            e.printStackTrace();
        }
        return output.format(date);

    }
}
