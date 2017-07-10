package sandbox.JohnsFoto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
/**
 * Created by levrun on 09.07.2017.
 */
class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        String s = solution2.solution("photo.jpg, Warsaw, 2013-09-05 14:08:15\n" +
                "john.png, London, 2015-06-20 15:13:22\n" +
                "myFriends.png, Warsaw, 2013-09-05 14:07:13\n" +
                "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n" +
                "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" +
                "BOB.jpg, London, 2015-08-05 00:02:03\n" +
                "notredame.png, Paris, 2015-09-01 12:00:00\n" +
                "me.jpg, Warsaw, 2013-09-06 15:40:22\n" +
                "a.png, Warsaw, 2016-02-13 13:33:50\n" +
                "b.jpg, Warsaw, 2016-01-02 15:12:22\n" +
                "c.jpg, Warsaw, 2016-01-02 14:34:30\n" +
                "d.jpg, Warsaw, 2016-01-02 15:15:01\n" +
                "e.png, Warsaw, 2016-01-02 09:49:09\n" +
                "f.png, Warsaw, 2016-01-02 10:55:32\n" +
                "g.jpg, Warsaw, 2016-02-29 22:13:11");
        System.out.println(s);
    }
    public String solution(String S) {
        // write your code in Java SE 8
        List<String> listOfPhotosInStrings = Arrays.asList(S.split("\n"));
        List<Photo> listOfPhotos = new ArrayList<>();
        Map<String, List<Photo>> mapOfCities = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for(String line : listOfPhotosInStrings) {
            String[] photoLine = line.split(", ");
            LocalDateTime dateTime = LocalDateTime.parse(photoLine[2], formatter);
            String city = photoLine[1];
            Photo photo = new Photo(photoLine[0], city, dateTime);
            listOfPhotos.add(photo);
            if(mapOfCities.containsKey(city)) {
                List<Photo> photos = mapOfCities.get(city);
                photos.add(photo);
            } else {
                List<Photo> photos = new ArrayList<>();
                photos.add(photo);
                mapOfCities.put(city, photos);
            }
        }
        // iterate over cities
        for (Map.Entry<String, List<Photo>> entry : mapOfCities.entrySet()) {
            List<Photo> photos = entry.getValue();
            String city = entry.getKey();
            // sort
            Collections.sort(photos, Comparator.comparing(Photo::getDateTime));
            // calculate max length
            int photosSize = photos.size();
            // put order num
            for(int i = 0; i < photos.size(); i++) {
                Photo photo = photos.get(i);
                if(photosSize >= 10 && i < 10) {
                    photo.setOrderNum(String.format("%02d", i+1));
                } else if(photosSize >=100 && i < 100) {
                    photo.setOrderNum(String.format("%03d", i+1));
                } else {
                    photo.setOrderNum(String.valueOf(i+1));
                }
            }
        }
        // loop over cities again and construct string
        String result = "";
        for(Photo photo : listOfPhotos) {
            List<Photo> photosFromMap = mapOfCities.get(photo.getCity());
            for(Photo photoInMap : photosFromMap) {
                if(photoInMap.getDateTime().equals(photo.getDateTime())) {
                    String fileName = photo.getFile();
                    String extension = fileName.split("\\.")[1];
                    result = result + photo.city + photoInMap.getOrderNum() + "." + extension + "\n";
                }
            }
        }
        return result;
    }
    public static class Photo {
        private String file;
        private String city;
        private LocalDateTime dateTime;
        private String orderNum;
        public Photo(String file, String city, LocalDateTime dateTime) {
            this.file = file;
            this.city = city;
            this.dateTime = dateTime;
        }
        public String getFile() {
            return file;
        }
        public void setFile(String file) {
            this.file = file;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public LocalDateTime getDateTime() {
            return dateTime;
        }
        public void setDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
        }
        public String getOrderNum() {
            return orderNum;
        }
        public void setOrderNum(String orderNum) {
            this.orderNum = orderNum;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Photo photo = (Photo) o;
            return dateTime.equals(photo.dateTime);
        }
        @Override
        public int hashCode() {
            return dateTime.hashCode();
        }
    }}

