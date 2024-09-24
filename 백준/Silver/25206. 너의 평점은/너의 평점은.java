import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String tmp = "";
		double totalCrdit = 0;
		double totalGrade = 0;
		double result = 0;
		while ((tmp = br.readLine()) != null)
		{
			StringTokenizer st = new StringTokenizer(tmp);
			String title = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String gradeStr = st.nextToken();
			if (!gradeStr.equals("P"))
			{
				double grade = 0;
				switch (gradeStr)
				{
					case "A+" :
						grade = 4.5;
						break;
					case "A0" :
						grade = 4.0;
						break;
					case "B+" :
						grade = 3.5;
						break;
					case "B0" :
						grade = 3.0;
						break;
					case "C+" :
						grade = 2.5;
						break;
					case "C0" :
						grade = 2.0;
						break;
					case "D+" :
						grade = 1.5;
						break;
					case "D0" :
						grade = 1.0;
						break;
					case "F" :
						grade = 0.0;
						break;
				}
				totalCrdit += credit;
				totalGrade += (credit * grade);
			}
		}

		result = totalGrade / totalCrdit;

		bw.write(Double.toString(result));
		bw.flush();
	}
}