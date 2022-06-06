package pkg;
public class Defaults{
  String name;
  int health ;
  int  BaseDmg;
public Defaults(String name){
  this.name = name;
}
  public Defaults(int health, int BaseDmg){
    this.BaseDmg = BaseDmg;
    this.health =  health;
  }
  public String getName(){
    return name;
  }
public int getHealth(){
  return health;
}
public int getBaseDmg(){
  return BaseDmg;
}
}