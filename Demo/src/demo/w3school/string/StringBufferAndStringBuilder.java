package demo.w3school.string;

public class StringBufferAndStringBuilder {

    public static void main(String[] args){

    	// StringBuffer Example
        StringBuffer buffer=new StringBuffer("hello");
        buffer.append("java");
        System.out.println(buffer);

        // StringBuilder Example
        StringBuilder builder=new StringBuilder("hello");
        builder.append("java");
        System.out.println(builder);

        // Performance Test of StringBuffer and StringBuilder
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<10000; i++){
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
