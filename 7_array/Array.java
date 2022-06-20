public class Array {

    int j = 90;
    
    public static void main(String[] args) {
        

        int[] rollNumber;

        rollNumber = new int[5]; // [0,0,0,0,0]
		rollNumber[6]

        for(int i = 0 ; i<5;i++){
           System.out.println("rollNumber["+i+"] = "+ rollNumber[i]);
           
        }

        boolean[] bb = new boolean[5]; // [0,0,0,0,0]

        for(int i = 0 ; i<5;i++){
           System.out.println("boolean["+i+"] = "+ bb[i]);
           
        }

        int[] marks = new int[]{ 89,78,18,23,99,100,88  };

        int size = marks.length;
        System.out.println("size1 is = "+size);
        System.out.println("size2 is = "+marks.length);

        for (int i = 0; i < marks.length; i++) {
            int item = marks[i];
            System.out.print(" ");
            System.out.print(item);
        }

        System.out.println(marks[4]);
        System.out.println("///////////////////");
        int[] rakeshMarks = new int[10]; //[0,1,2,3,4]
        //rakeshMarks[0]= 78;
        //rakeshMarks[4]= 56;
        //rakeshMarks[7]=89;

        for (int i = 0; i < rakeshMarks.length; i++) {
            rakeshMarks[i]= 2*(i+1);
        }

        for (int i = 0; i < rakeshMarks.length; i++) {
            System.out.print(" "+ rakeshMarks[i]);
        }
        System.out.println();
        // Array aa = new Array();
        // aa.j

        // this.j

       

        Student stu = new Student();
        stu.init(123,"Rakesh");

        Student stu1 = new Student();
        stu1.init(124,"Suresh");    

        Student stu2 = new Student();
        stu2.init(125,"Ramesh");

        Student stu3 = new Student();
        stu3.init(126,"Umesh");

        Student[] student =new Student[4];
        student[0]=stu;
        student[1]=stu1;
        student[2]=stu2;
        student[3]=stu3;

        for (int i = 0; i < student.length; i++) {
            Student ss = student[i];
            System.out.print(ss.rollNumber+" ");
            System.out.println(ss.name);

        }


        int[] umeshMarks = new int[]{ 89,78,18,23,99,100,88  };
        int totalMarks= 0;
        
        for(int i = 0 ; i<umeshMarks.length;i++){
            totalMarks = totalMarks + umeshMarks[i];
        }

        System.out.println(totalMarks);
    }
}
