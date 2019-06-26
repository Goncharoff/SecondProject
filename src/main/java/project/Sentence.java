package project;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Sentence implements Splitter {

    @Override
    public String[] split(String source) {
        List<String> result = new ArrayList<>();
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(source);
        int start = iterator.first();

        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
            result.add(source.substring(start, end));

        }
        return result.toArray(new String[0]);
    }


}
