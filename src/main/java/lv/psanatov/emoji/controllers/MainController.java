package lv.psanatov.emoji.controllers;

import lv.psanatov.emoji.services.EmojiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Date: 17-Dec-17
 * Time: 15:06
 */
@RestController
public class MainController {
    @Autowired
    private EmojiService emojiService;

    @RequestMapping(name = "/getEmoji", method = RequestMethod.POST)
    @ResponseBody
    Map getEmoji() {
        HashMap hashMap = new HashMap();
        hashMap.put("emoji", emojiService.getEmoji());
        return hashMap;
    }
}
