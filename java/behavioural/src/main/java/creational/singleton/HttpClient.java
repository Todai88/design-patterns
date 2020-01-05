package main.java.creational.singleton;

public class HttpClient {
    private final String baseRouteUrl;
    private static HttpClient httpClient = null;

    private HttpClient(String baseRouteUrl) {
        this.baseRouteUrl = baseRouteUrl;
    }

    public static HttpClient getInstance(String baseRouteUrl) {
        if (httpClient == null) {
            httpClient = new HttpClient(baseRouteUrl);
        }
        return httpClient;
    }

    public String createUrl(String path, String ...requestParams) {
        String requestParamString = "";
        for (String requestParam : requestParams) {
            requestParamString += String.format("&%s",requestParam);
        }
        return String.format("%s/%s?%s", this.baseRouteUrl, path, requestParamString);
    }
}
