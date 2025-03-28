//package OOPS.JSONHandling;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
////Suppose we have JSON array with each JSON object having structure.Most optimal Java implementation to parse JSON and find all employees living in target city
//        /*
//        [
//            {
//                "id":1,
//                    "name":"Nalin",
//                    "AddressDetails": [
//                        {
//                            "city":"Delhi",
//                             "state":"Delhi",
//                             "country":"India"
//                        },
//                        {
//                            "city":"Mumbai",
//                            "state":"Maharashtra",
//                            "country":"India"
//                        }
//                    ]
//            },
//            {
//                "id":2,
//                    "name":"John",
//                    "AddressDetails": [
//                        {
//                            "city":"New York",
//                            "state":"New York",
//                            "country":"USA"
//                        },
//                        {
//                            "city":"Los Angeles",
//                            "state":"California",
//                            "country":"USA"
//                        }
//                    ]
//            }
//        ]
//        */
//public class JSONArray {
//
//    public static void main(String[] args) {
//        String jsonString = "[{\"id\":1,\"name\":\"Nalin\",\"AddressDetails\":[{\"city\":\"Delhi\",\"state\":\"Delhi\",\"country\":\"India\"},{\"city\":\"Mumbai\",\"state\":\"Maharashtra\",\"country\":\"India\"}]},{\"id\":2,\"name\":\"John\",\"AddressDetails\":[{\"city\":\"New York\",\"state\":\"New York\",\"country\":\"USA\"},{\"city\":\"Los Angeles\",\"state\":\"California\",\"country\":\"USA\"}]}]";
//        String targetCity = "Delhi";
//
//        try {
//            List<Integer> employeeIds = findEmployeeIdsByCity(jsonString, targetCity);
//            System.out.println("Employee IDs living in " + targetCity + ": " + employeeIds);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static List<Integer> findEmployeeIdsByCity(String jsonString, String targetCity) throws IOException {
//        List<Integer> employeeIds = new ArrayList<>();
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<Employee> employees = objectMapper.readValue(jsonString, new TypeReference<List<Employee>>() {
//        });
//
//        for (Employee employee : employees) {
//            for (Address address : employee.getAddressDetails()) {
//                if (address.getCity().equalsIgnoreCase(targetCity)) {
//                    employeeIds.add(employee.getId());
//                    break;
//                }
//            }
//        }
//        return employeeIds;
//    }
//
//
//}
