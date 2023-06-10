import java.io.FileReader;


public class Task1 {
    // Дана строка sql-запроса "select * from students where ". 
    // Сформируйте часть WHERE этого запроса, используя StringBuilder. 
    // Данные для фильтрации приведены ниже в виде json-строки.
    // Если значение null, то параметр не должен попадать в запрос.


    public static String getSqlQery(String jsonLine){
        String[] tempArr = jsonLine.split(", "); //разбиваю на подстроки, чтобы в каждой получился атрибут и его значение
        String[][] resArr = new String[tempArr.length][2];
        StringBuilder sb = new StringBuilder("select * from students where ");
        int flag = 0; // чтобы определить добавляется and или нет
        for (int i = 0; i < tempArr.length; i++){
            resArr[i] = tempArr[i].split(":"); //каждую подстроку делю на аргумент и значение
            if (!(resArr[i][1].equals("null"))){
                if (flag ==1) sb.append(" and ");
                sb.append(String.format("%s=\"%s\"", resArr[i][0], resArr[i][1]));
                flag = 1;
            }
        }
        return sb.toString();
    }


    public static String readFile(){
        // другого способа задать исходную строку в оригинальном виде,
        //а именно с сохранением кавычек, я не знаю...
        try {
            FileReader fr = new FileReader("file.txt");
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = fr.read()) != -1){
                Character ch = (char)c;
                if (ch != '"'){
                    sb.append(ch.toString());
                }
            }
            fr.close();
            return sb.toString();
        }
        catch (Exception e){
            return "Нет файла или ошибка чтения";
        }
    }
}
