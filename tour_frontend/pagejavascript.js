
const form = document.querySelector("form");

form.addEventListener("submit", async function (event) {
    event.preventDefault();

    const registration = {
        name: document.getElementById("name").value.trim(),
        registerNumber: document.getElementById("registerNumber").value.trim(),
        department: document.getElementById("department").value,
        year: document.getElementById("year").value.trim(),
        email: document.getElementById("email").value.trim(),
        phone: document.getElementById("phone").value.trim(),
        destination: document.getElementById("destination").value,
        date: document.getElementById("date").value,
    };
    console.log("Registration data:",registration);fetch(
            "http://localhost:8080/api/tour-registrations",
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(registration)
            }
        )
        .then(response => {
            if(!response.ok) {
                return response.text().then(message => {
                    throw new Error("HTTP"+response.status+": "+message);
                });
            }
            return response.json();
        })
        .then(data =>{
            alert("student added succesfully");
            console.log(data);
        })
        .catch(error => {
            console.error("Error details:",error);
            alert("Error: "+error.message);
        });
    });