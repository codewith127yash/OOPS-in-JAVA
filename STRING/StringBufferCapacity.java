public class StringBufferCapacity
{
    public static void main(String[] args) 
	{
		StringBuffer s = new StringBuffer("A");
		System.out.println(s.capacity());
		s.append(" java is my favorite language");
		System.out.println(s.capacity());
		StringBuffer sb=new StringBuffer();//Empty StringBuffer  
		System.out.println("Empty String Buffer");
        System.out.println(sb.capacity());//default capacity 16    
        sb.append("Hello ");  
		System.out.println(sb);
        System.out.println(sb.capacity());//now capacity 16    
        sb.append("java is my favorite language ");  
		System.out.println(sb);		
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
        sb.append("string");   
		System.out.println(sb);
        System.out.println(sb.capacity());//now (34*2)+2=70     	
    }  
} 