let xmlContent = '';
        let tableStudents = document.getElementById('students');
        fetch('/gradeReport.xml').then((response)=> {
			
            response.text().then((xml)=>{
                xmlContent = xml;

                let parser = new DOMParser();
                let xmlDOM = parser.parseFromString(xmlContent, 'application/xml');
                let students = xmlDOM.querySelectorAll('gradeRecord');

                students.forEach(studentXmlNode => {

                    let row = document.createElement('tr');

                    //Number
                    let td = document.createElement('td');
                    td.innerText = studentXmlNode.children[0].innerHTML;
                    row.appendChild(td);

                    //Student
                    td = document.createElement('td');
                    td.innerText = studentXmlNode.children[1].innerHTML;
                    row.appendChild(td);
					console.log(tableStudents);
                    
                    //Grade
                    td = document.createElement('td');
                    if(studentXmlNode.children[2].innerHTML == 1){
                        studentXmlNode.children[2].innerHTML = "Awful";
                    }
                    if(studentXmlNode.children[2].innerHTML == 2){
                        studentXmlNode.children[2].innerHTML = "Bad";
                    }
                    if(studentXmlNode.children[2].innerHTML == 3){
                        studentXmlNode.children[2].innerHTML = "Not bad";
                    }
                    if(studentXmlNode.children[2].innerHTML == 4){
                        studentXmlNode.children[2].innerHTML = "Good";
                    }
                    if(studentXmlNode.children[2].innerHTML == 5){
                        studentXmlNode.children[2].innerHTML = "Perfect";
                    }
                    td.innerText = studentXmlNode.children[2].innerHTML;
                    row.appendChild(td);

                    tableStudents.children[1].appendChild(row);    
                });
                
            });
        });    