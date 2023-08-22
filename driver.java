
class marks {
    int internal;
    int endsem;
    char grade;

    marks(int internal, int endsem) {
        this.internal = internal;
        this.endsem = endsem;
        com_grade();
    }

    void com_grade() {
        int sum = 0;
        sum = sum + this.internal + this.endsem;
        if (this.endsem > 18 && sum > 50) {
            this.grade = 'P';
           
        } 
        else {
            this.grade = 'F';
        }
        
    }
   
}

class student extends marks {
    long regno;
    String name;
    marks o1 = new marks(internal,endsem);

    student( long regno, String name,int internal, int endsem) {
        super(internal, endsem);
        this.regno = regno;
        this.name = name;
        if(this.grade=='P')
        {
            display();
        }
       
    }
   void display(){
        System.out.println("name:"+this.name);
        System.out.println("reg:"+this.regno);
        System.out.println("grade:"+this.grade);

}

}

class driver {
    public static void main(String[] args) {
        student s1 = new student(210953278, "ram",20,50);
       
        
        student s2 = new student(210953290, "sam",10,30);
        
       
        student s3 = new student(210953200, "tom",30,20);
        
        
    }
}