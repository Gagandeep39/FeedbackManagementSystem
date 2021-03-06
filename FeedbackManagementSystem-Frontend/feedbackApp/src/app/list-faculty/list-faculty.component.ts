import { Component, OnInit } from '@angular/core';
import { FacultyModel } from '../models/faculty.model';
import { FacultyService } from '../service/faculty.service';
import { FeedbackService } from '../service/feedback.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-faculty',
  templateUrl: './list-faculty.component.html',
  styleUrls: ['./list-faculty.component.css']
})
export class ListFacultyComponent implements OnInit {

  faculty:FacultyModel[]=[];

  constructor(private facultyService:FacultyService,
              private feedbackService:FeedbackService,
              private route: Router) { }

  ngOnInit() {
    this.facultyService.fetchAllFaculties().subscribe(data => {
      this.faculty =data;
      console.log(this.faculty);
    });
  }

  generateReport(index:number){
    
      this.route.navigate(['list-feedback-faculty',index]);
  }

  redirectToAdmin(){
    this.route.navigate(['admin']);
  }
}
