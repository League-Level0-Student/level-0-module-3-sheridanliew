int x=120;
int y=250;
int s=380;
void setup(){
  size(500,500);
}
void draw(){
  background(255,255,255);
  noFill();
  for(int i=230;i>=10;i-=10){
    ellipse(x,y,i,i);
  }
  for(int i=230;i>=10;i-=10){
    ellipse(s,y,i,i);
  }
  x+=1;
  s-=1;
  if(x==380){
    x=120;
  }
  if(s==120){
    s=380;
  }
}