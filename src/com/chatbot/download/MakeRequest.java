package com.chatbot.download;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class MakeRequest {
	private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();
//
//    public static void main(String[] args) throws Exception {
//
//        MakeRequest obj = new MakeRequest();
//
//        System.out.println("Testing 1 - Send Http GET request");
//        obj.downloadFile();
//
//
//    }
    public  void downloadFile() throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.artibot.ai/api/leads/search.csv?timezone=Asia/Calcutta&botId=08187d2d-218d-4264-918b-5d3cecd2b7aa&query=**&range=5"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .setHeader("accountid", "ce181762-8a69-41fa-b604-28b51390b8e0")
                .setHeader("authorization",  "Bearer " + "eyJraWQiOiJ5RExldmhCUnhCZnNxRTJlQ1V3SFNwQmxhNjlPTU8xTW9FbW5yZTJpRHVnPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIzM2ExMjM2OS01OGJmLTQ0NmMtODIzYi1jNmM5YzUxMGUzZTEiLCJldmVudF9pZCI6IjYxZTUyYjVjLWM5MWMtNDc1My04NWQ2LTk5ZmRkZjQzOTZlNyIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1OTY0MzY1NzUsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX1pIOU9JM2ZiZCIsImV4cCI6MTU5NjgxMDIxNCwiaWF0IjoxNTk2ODA2NjE0LCJqdGkiOiJkZWM0Y2VkZS0xNmY5LTQ4OTUtYmY2Ni0wZjhjYmIxZmVlMzYiLCJjbGllbnRfaWQiOiI0c2lobmgzcmZwMXRzdTY4bDFlNmduaHVwbCIsInVzZXJuYW1lIjoiMzA3NTBmZTEtYTY2My00MmU0LWI4Y2UtNDcwYjcxZTVkN2VlIn0.at7kGDQR-6PJBA0OE-eCcyE8ZtuLV1NAe22qBHmVZtjMLDIYWlvIHe3j5gLv5wtwd-KSR0GYvREcF46uk623f3oE_9G6oGGnBqAEYJO0VH5gHURHyUe7YZ8cRVqKOfl91kAxXBM39uTh3fRmMlt25L-n0GOUmJo_y9xdrwNXnmvH3zYAz7V4VJYVw4EpZNpXciA85LJf8DU7euH-on9NOaHjks-1GQzPyh3p6szWifWoSkeCYWwz3szv4GwZ4lyGFHlZQHDNlnPpyHvgjwstHuohrsl4YXMburoemEwDhR1-0liQpe5jIu8O2uaMxaI9epJhTtshXNFzBs_8WjDp3A")
                .build();
        

        String FILE_NAME = "D:\\data.csv";
        Path newFilePath = Paths.get(FILE_NAME);

        if(Files.exists(newFilePath)) {
            Files.delete(newFilePath);
            System.out.println("Success");
        }

        
        Path tempFile = Files.createFile(newFilePath);
        HttpResponse<Path> response = httpClient.send(request, HttpResponse.BodyHandlers.ofFile(tempFile));
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
