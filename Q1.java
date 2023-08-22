class first
{
String a=" ";
first(){ disp(); };
void disp() { a= a+" CPU "; }
}
class second extends first
{
second(){ disp();}
void disp() { a= a+" RAM"; }
}
class Q1
{
public static void main(String args[]){
second s = new second();
System.out.println(s.a);
}}