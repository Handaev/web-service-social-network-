package com.example.social_network;

import com.example.social_network.config.HibernateConfig;
import com.example.social_network.entities.User;
import com.example.social_network.repository.RegistrationDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        RegistrationDAO studentDao = context.getBean(RegistrationDAO.class);

        User user = new User();
//        user.setId(12L);
        user.setFirstName("John"); // Установите значение для firstName
        user.setLastName("Doe");
        user.setEmail("john2345oe@example.com");
        user.setPassword("password123");
        user.setAboutMe("Software Developer");
//        user.setAvatar("C:\\Users\\Lenovo\\Documents\\IdeaProjects\\social_network\\src\\main\\resources\\static\\BD_images\\Диаграмма без названия.drawio.png");
        user.setCreatedAt(LocalDateTime.now());
//        user.setAboutMe("Software Developer");
        user.setFirstName("John"); // Установите значение для firstName
        user.setLastName("Doe");
        studentDao.save(user);
        System.out.println("Student inserted: " + user);

//        // Initialize Spring context
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
//        UserRepositoryDAO studentDao = context.getBean(UserRepositoryDAO.class);
//
//        // Insert a new student with ID 101 and name "Nisha"
//        User student1 = new User();
//        // Manually set ID for demonstration
//        student1.setId(101);
//        student1.setUsername("Nisha");
//        studentDao.save(student1);
//        System.out.println("Student inserted: " + student1);
//
//        // Update the student's name to "Priya"
//        student1.setUsername("Priya");
//        studentDao.update(student1);
//        System.out.println("Student updated: " + student1);
//
//        // Retrieve the student with ID 101
//        User retrievedStudent = studentDao.findById(101);
//        System.out.println("Retrieved Student: " + retrievedStudent);
//
//        // Insert additional students for demonstration
//        User student2 = new User();
//        // Manually set ID for demonstration
//        student2.setId(102);
//        student2.setUsername("Danish");
//        studentDao.save(student2);
//
//        User student3 = new User();
//        // Manually set ID for demonstration
//        student3.setId(103);
//        student3.setUsername("Sneha");
//        studentDao.save(student3);
//
//        // Retrieve all students before deletion
//        System.out.println("All Students Before Deletion:");
//        List<User> studentsBeforeDeletion = studentDao.findAll();
//        studentsBeforeDeletion.forEach(System.out::println);
//
//        // Delete the student with ID 102
//        studentDao.deleteById(102);
//        System.out.println("Student with ID 102 deleted.");
//
//        // Retrieve all students after deletion
//        System.out.println("All Students After Deletion:");
//        List<User> studentsAfterDeletion = studentDao.findAll();
//        studentsAfterDeletion.forEach(System.out::println);
//
//        // Close the Spring context
        context.close();
    }
}
