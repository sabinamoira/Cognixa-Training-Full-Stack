import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { ProjectDetailContainerComponent } from './project-detail-container.component';

describe('ProjectDetailContainerComponent', () => {
  let component: ProjectDetailContainerComponent;
  let fixture: ComponentFixture<ProjectDetailContainerComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ ProjectDetailContainerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjectDetailContainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
