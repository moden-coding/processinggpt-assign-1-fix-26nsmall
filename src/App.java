import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void setup(){
        background(200);
    }

    public void settings(){
        size(400,400);
    }

    public void draw(){
        strokeWeight(16);
        stroke(0,0, 255);
        fill(255, 0, 0);
        rect(0, 0, 100, 200);
        stroke(255, 0, 0);
        strokeWeight(20);
        fill(0, 0, 255);
        ellipse(400, 400, 100, 100);
        strokeWeight(5);
        line(90, 190, 365, 365);
    }
}
