//�ɼ�����������
import java.io.*;//���� java.io������������
public class App3_4
{
	public static void main(String[] args) throws IOException
	{
		float num;
		String str;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������һ��ʵ��:");
		str=buf.readLine();
		num=Float.parseFloat(str);//��strת����float���͸�ֵ��num
		System.out.println("�������ʵ��Ϊ:\n"+num);
		}
	}