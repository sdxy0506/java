//�ɼ��������ַ���
import java.io.*;//���� java.io������������
public class App3_3
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader buf;//����bufΪBufferedReader��ı�����������java.io�����
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������ַ���:");
		str=buf.readLine();//��������ַ���ָ����str���
		System.out.println("��������ַ���Ϊ:\n"+str);
		}
	}