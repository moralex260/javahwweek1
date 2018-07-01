package homeWorkStudents;

public class ManagerOfDatabase extends MenuForDatabase{



        private String name;
        private String lastname;
        private String age;
        private String sex;
        private String adress;


    public ManagerOfDatabase() {
        }

    public ManagerOfDatabase(String name, String lastname, String age, String sex, String adress) {
            this.name = name;
            this.lastname = lastname;
            this.name = age;
            this.sex = sex;
            this.adress = adress;
        }


        public String getlastname () {
            return lastname;
        }

        public void setlastname (String lastname){
            this.lastname = lastname;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getage () {
            return age;
        }

        public void setAge (String age){
            this.age = age;
        }

        public String getSex () {
            return sex;
        }

        public void setsex (String sex){
            this.sex = sex;
        }

        public String toString () {
            return this.name + " " + this.lastname + " " + this.age + " " + this.sex;
        }

    }





