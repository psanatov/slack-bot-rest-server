package lv.psanatov.emoji.services;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Date: 17-Dec-17
 * Time: 17:05
 */
@Service
public class EmojiService {
    private Integer outputLayerSize;

    public String getEmojiString() {
        // Array of values
        String[] resultStrings = new String[] {"grin", "sunglasses", "thinking_face"};

        // Random index
        Random r = new Random();
        int randomIndex = 0 + r.nextInt(3);
        String resultString = resultStrings[randomIndex];

        return resultString;
    }

    public String getEmoji() {

        return getEmojiString();
    }
}
