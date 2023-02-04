package org.example;

public class Main {

            private String[] films = new String[0];
            private int limit;

            public Main() {
                this.limit = 10;
            }

            public Main (int limit) {
                this.limit = limit;
            }


            public void addFilm(String Main) {
                String[] tmp = new String[films.length + 1];
                for (int i = 0; i < films.length; i++) {
                    tmp[i] = films[i];
                }
                tmp[tmp.length - 1] = Main;
                films = tmp;
            }

            public String[] findAll() {
                return films;

            }

            public String[] findLast(int limit) {
                int resultLength;
                if (films.length < limit) {
                    resultLength = films.length;
                } else {
                    resultLength = limit;
                }
                String[] tmp = new String[resultLength];
                for (int i = 0; i < tmp.length; i++) {
                    tmp[i] = films[films.length - 1 - i];
                }
                return tmp;
            }
        }



