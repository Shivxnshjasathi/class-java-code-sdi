package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {
        Student newStudent = new Student("Alice", "Johnson", "alice.johnson@example.com");
        saveStudent(newStudent);
        Student student = getStudent(newStudent.getId());
        System.out.println("Fetched Student: " + student);
        student.setEmail("alice.johnson_updated@example.com");
        updateStudent(student);
        deleteStudent(student.getId());
    }

    public static void saveStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(student); 
            transaction.commit();
            System.out.println("Student saved successfully!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); 
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    public static Student getStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student student = null;

        try {
            student = session.get(Student.class, id); 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return student;
    }
    public static void updateStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(student); 
            transaction.commit();
            System.out.println("Student updated successfully!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void deleteStudent(int studentId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Student student = session.get(Student.class, studentId);
            if (student != null) {
                session.delete(student); 
                System.out.println("Student deleted successfully!");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
