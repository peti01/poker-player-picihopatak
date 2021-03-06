package org.leanpoker.player.config;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;
import org.leanpoker.player.json.Config;

public class ConfigRetriever {
    static final String url = "http://owlab.hu/conf.txt";
    
    public static Config readJsonFromUrl() throws IOException {
        String jsonText = IOUtils.toString(new URL(url), Charset.defaultCharset());
        return new GsonBuilder().create().fromJson(jsonText, Config.class);
    }


}