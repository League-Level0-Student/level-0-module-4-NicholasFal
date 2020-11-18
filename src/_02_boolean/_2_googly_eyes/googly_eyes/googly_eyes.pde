PImage face;
void setup() {
face = loadImage("googlyeyes.jpg");  
size(800, 600);
face.resize(300, 300);
}

void draw() {
  image(face, 200, 200);
  noStroke();
  fill(255, 255, 255);
  ellipse(325, 350, 50, 50);
  ellipse(385, 350, 50, 50);
   fill(0, 0, 0);
  int x = mouseX;
  if(x > 402) {
    x = 402;
  } else if(x < 370) {
   x = 370; 
  }
  int y = mouseY;
  if(y > 360) {
    y = 360;
  } else if(y < 337) {
   y = 337; 
  }
  
      ellipse(x, y, 10, 10);
       ellipse(x - 60, y, 10, 10);
  if(mousePressed) {
   System.out.println(mouseX);
   System.out.println(mouseY);
  }
}
