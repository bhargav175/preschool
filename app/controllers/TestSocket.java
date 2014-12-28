package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.content.ShortNote;
import play.libs.F;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.WebSocket;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Admin on 27/5/14.
 */
public class TestSocket extends Controller {
    public static WebSocket<JsonNode> hello() {

        return new WebSocket<JsonNode>() {

            // Called when the Websocket Handshake is done.
            public void onReady(final play.mvc.WebSocket.In<JsonNode> in, final play.mvc.WebSocket.Out<JsonNode> out) {

                // For each event received on the socket,
                in.onMessage(new F.Callback<JsonNode>() {
                    public void invoke(JsonNode event) {

                        // Log events to the console
                        System.out.println(event);
                        List<ShortNote> shortNoteList=ShortNote.findAllShortNotes();
                        out.write(Json.toJson(shortNoteList));

                    }
                });

                // When the socket is closed.
                in.onClose(new F.Callback0() {
                    public void invoke() {

                        System.out.println("Disconnected");

                    }
                });

                // Send a single 'Hello!' message

                Timer timer = new Timer();

                timer.schedule( new TimerTask() {
                    public void run() {
                        List<ShortNote> shortNoteList=ShortNote.findAllShortNotes();
                        out.write(Json.toJson(shortNoteList));
                    }
                }, 0, 2*1000);


            }



        };
    }
}
