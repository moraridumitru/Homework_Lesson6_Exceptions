
/**Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
 Login должен содержать только латинские буквы, цифры и знак подчеркивания.
 Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 Password должен содержать только латинские буквы, цифры и знак подчеркивания.
 Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны. Использоввать исключения**/
class WrongLoginException extends Exception {   //Класс Exception — это встроенный класс, представляющий исключения. Он является частью стандартной библиотеки Java и автоматически доступен во всех программах Java.
    public WrongLoginException(String message) {
        super(message);                       // При вызове метода super() с аргументам message мы фактически вызываем конструктор
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}

