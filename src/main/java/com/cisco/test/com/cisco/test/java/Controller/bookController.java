package com.cisco.test.com.cisco.test.java.Controller;

import java.util.List;

import com.cisco.test.com.cisco.test.java.Model.book;
import com.cisco.test.com.cisco.test.java.Repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class bookController {


        @Autowired
        private bookRepository bookRepository;

        @GetMapping("/health")
        public String home(){
            return "Hello!!! This is My MY First AWS Deployment!!";
        }

        @PostMapping("/books")
        public book addBook(@RequestBody book Book) {
            return bookRepository.save(Book);
        }


        @GetMapping("/books")
        public ResponseEntity<List<book>> getAllBooks() {
            return ResponseEntity.ok(bookRepository.findAll());
        }


        /*@GetMapping("employees/{id}")
        public ResponseEntity<book> findBookByName(@PathVariable(value = "id") Integer employeeId) {
            Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                    () -> new ResourceNotFoundException("Employee not found" + employeeId));
            return ResponseEntity.ok().body(employee);
        }

        @PutMapping("employees/{id}")
        public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Integer employeeId,
                                                       @RequestBody Employee employeeDetails) {
            Employee employee = employeeRepository.findById(employeeId)
                    .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
            employee.setName(employeeDetails.getName());
            final Employee updatedEmployee = employeeRepository.save(employee);
            return ResponseEntity.ok(updatedEmployee);

        }
*/
        /*@DeleteMapping("books/{id}")
        public ResponseEntity<Void> deleteEmployee(@PathVariable(value = "id") Integer employeeId) {
            Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                    () -> new ResourceNotFoundException("Employee not found" + employeeId));
            employeeRepository.delete(employee);
            return ResponseEntity.ok().build();
        }
*/

}
