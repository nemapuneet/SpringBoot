package com.puneet.model;

import java.util.Date;

public class Todo {
   private int id;
   private String name;
   private String desc;
   private Date targetDate;
   private boolean isDone;

   public Todo(int id, String name, String desc, Date targetDate, boolean isDone) {
      this.id = id;
      this.name = name;
      this.desc = desc;
      this.targetDate = targetDate;
      this.isDone = isDone;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDesc() {
      return desc;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public Date getTargetDate() {
      return targetDate;
   }

   public void setTargetDate(Date targetDate) {
      this.targetDate = targetDate;
   }

   public boolean getDone() {
      return isDone;
   }

   public void setDone(boolean done) {
      isDone = done;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + id;
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Todo other = (Todo) obj;
      if (id != other.id) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return String.format(
         "Todo [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]", id,
         name, desc, targetDate, isDone);
   }
}
