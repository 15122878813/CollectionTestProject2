package Stream;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Student implements Externalizable{
	
	private String name;
	
	private Integer age;
	
	private String addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		this.name = (String)in.readObject();
		
		this.age = in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(this.name);
		
		out.writeInt(this.age);
		
	}

	public Student(String name, Integer age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
} 

public class ExternalizableTest {
	
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("file.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Student student = new Student("张强",19,"东丽区");
			
			oos.writeObject(student);
			
			System.out.println("序列化OK");
			
			///////////////////////////////////////////////////////
			FileInputStream fis = new FileInputStream("file.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student readObject = (Student) ois.readObject();
			
			System.out.println(readObject);
			
			System.out.println("反序列化OK");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
