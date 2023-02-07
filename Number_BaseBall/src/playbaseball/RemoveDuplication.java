package playbaseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplication {
    List<String> duplicatedString;

    public RemoveDuplication() {}

    public RemoveDuplication(String[] strArray) {
        this.duplicatedString = Arrays.asList(strArray);
    }

    public List<String> remove() {
        
		return duplicatedString.stream().distinct().collect(Collectors.toList()); 
    }
}