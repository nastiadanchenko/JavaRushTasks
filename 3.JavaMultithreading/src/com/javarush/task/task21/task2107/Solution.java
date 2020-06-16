package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable{

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public Object clone() throws CloneNotSupportedException {
        Solution solutionClone = new Solution();
       // solutionClone.users = this.users; - неверно
        for (Map.Entry<String,User> x:this.users.entrySet()
             ) {
            int age = x.getValue().age;
            String name = x.getValue().name;
            solutionClone.users.put(x.getKey(), new User(age, name));
        }
        return solutionClone;
    }

    public static class User implements Cloneable{
        @Override
        protected Object clone() throws CloneNotSupportedException {
            User userClone = new User(this.age, this.name);
            return userClone;
        }

        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int hashCode() {
            int result;
            result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj==this) return true;
            if(!(obj instanceof User)) return false;
            User user = (User) obj;
            if (age!=user.age) return false;
            if(name!=null ? !name.equals(user.name): user.name!=null) return false;
            return true;
        }
    }
}
