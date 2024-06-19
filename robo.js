function handleclick() {
    const amazingTechFacts = [
        "The first 1GB hard drive, introduced by IBM in 1980, weighed over 500 pounds and cost $40,000.",
        "NASA's Curiosity rover on Mars has the same amount of computing power as a 1990s era Apple iMac.",
        "The first mobile phone call was made by Martin Cooper in 1973, who was an engineer at Motorola.",
        "The first website, created by Tim Berners-Lee in 1991, is still online today as a historical project.",
        "The computer virus 'MyDoom' is estimated to have caused $38 billion in damages, making it the most expensive computer virus in history.",
        "Amazon's AWS (Amazon Web Services) generates more revenue than its famous online retail division.",
        "Google's search engine began as a research project by Larry Page and Sergey Brin, who were both Ph.D. students at Stanford University.",
        "The term 'bug' for computer glitches originated in 1947 when a moth caused a malfunction in the Harvard Mark II computer.",
        "The first video uploaded to YouTube was by co-founder Jawed Karim titled 'Me at the zoo' in 2005.",
        "The domain name 'voice.com' was sold for $30 million in 2019, making it one of the most expensive domain sales ever.",
        "SpaceX's Falcon Heavy rocket can lift payloads equivalent to sending a fully-loaded 737 jet to orbit.",
        "The world's first 3D-printed car, the Strati, was produced in 2014 and took just 44 hours to print.",
        "IBM's Watson AI computer famously won the quiz show Jeopardy! in 2011, defeating two former champions.",
        "The first text message, 'Merry Christmas', was sent in 1992 by Neil Papworth to Richard Jarvis, using a PC and the Vodafone network.",
        "The internet requires an estimated 50 million horsepower in electricity to function, roughly the same as the entire country of Spain.",
    ];

    const dirtyJokes = [
        "Why don't oysters donate to charity? Because they are shellfish.",
        "What did the hurricane say to the coconut tree? Hold onto your nuts, this is going to be one hell of a blow job!",
        "Why don't lobsters share? Because they're shellfish.",
        "Why did the scarecrow get promoted? Because he was outstanding in his field.",
        "Why did the sperm cross the road? Because I put on the wrong sock this morning.",
        "Why don't scientists trust atoms? Because they make up everything.",
        "Why was the math book sad? Because it had too many problems.",
        "Why did the chicken go to the seance? To talk to the other side.",
        "What’s the difference between a G-spot and a golf ball? A guy will actually search for a golf ball.",
        "Why don’t some couples go to the gym? Because some relationships don’t work out.",
        "I told my wife she was drawing her eyebrows too high. She looked surprised.",
        "Why don’t scientists trust atoms? Because they make up everything.",
        "I'm reading a book about anti-gravity. It's impossible to put down!",
        "Why did the sperm cross the road? Because I put on the wrong sock this morning.",
        "Why don't scientists trust atoms? Because they make up everything!",
        "Why was the math book sad? Because it had too many problems.",
        "Why did the chicken go to the seance? To talk to the other side.",
        "What’s the difference between a G-spot and a golf ball? A guy will actually search for a golf ball."
    ];

    const bColor = ["a2d2ff", "bde0fe", "f1faee", "f5ebe0", "003566", "d8e2dc", "ade8f4", "e5e5e5", "84a98c", "84a98c", "03071e"];
    // Get user input
    const feed = document.getElementById("nameInput").value.toLowerCase().trim();
    const operators = /[*/+-]/;
    // Get current hour
    const now = new Date();
    const hours = now.getHours();









    // Determine the greeting message
    let greeting;
    if (hours < 12) {
        greeting = "Good Morning";
    }
    else if (hours > 12 && hours <= 18) {
        greeting = "Good Afternoon";
    } else if (hours > 18 && hours < 20) {
        greeting = "Good Evening";
    } else if (hours > 20 && hours <= 23) {
        greeting = "Good Night";
    }

    // Display the greeting
    if (feed == "nishant") {
        response = `${greeting}, My Boss`;
        // return response;
        // document.getElementById("grbraveeeting-text").textContent = greetingText;
    }
    else if (operators.test(feed)) {
        //calculation
        function calculate(expression) {
            try {
                return eval(expression);
            } catch (error) {
                return "Error: Invalid expression";
            }
        }

        let result = calculate(feed);
        response = `The output is: \n${result}`;
    }

    // conversatation
    else if (feed.includes('hello') || feed.includes('hi') || feed.includes('gillie') || feed.includes('hey') || feed.includes('gils')) {
        response = "Hi there! what's up?";
    } else if (feed.includes('fine') || feed.includes('am good')) {
        response = "That's great! Me too. Do you seek for help?";
    } else if (feed.includes('yes') || feed.includes('yeah')) {
        response = "Tell me what kind of help I can do for you?";
    } else if (feed.includes('you do') || feed.includes('can you')) {
        response = "I can you tell you some jokes , facts and do some calculation, date and time and many more.";
    } else if (feed.includes('are you')) {
        response = "I am fine, what's about you?";
    } else if (feed.includes('you doing') || feed.includes("whats up?") || feed.includes("whats up") || feed.includes("what's up?")) {
        response = "Nothing much just starring at you, Quietly !";
    } else if (feed.includes('change color') || feed.includes("background")) {
        const randomIndex = Math.floor(Math.random() * bColor.length);
        const randomBColor = "#" + bColor[randomIndex];
        document.body.style.backgroundColor = randomBColor;
        response = "Color has been change.";
    } else if (feed.includes('dance')) {
        document.getElementById("bodyID").style.animationPlayState = "running";
        response = "Dancing.";
    }
    else if (feed.includes('help')) {
        response = "Of course! What do you need assistance with?";
    } else if (feed.includes('your name') || feed.includes("name?")) {
        response = "I'm Gillie! You can call me Gils.";
    } else if (feed.includes('weather')) {
        response = "I'm sorry, I don't have access to real-time data.";
    } else if (feed.includes('date and time') || feed.includes('date') || feed.includes('time')) {
        let dateTime = new Date().toLocaleString();
        response = "It's currently " + dateTime + ".";
    }
    else if (feed.includes('interesting fact') || feed.includes('fact') || feed.includes('facts')) {
        const randomIndex = Math.floor(Math.random() * amazingTechFacts.length);
        const fact = amazingTechFacts[randomIndex];
        // Example: "Tell me an interesting fact"
        response = `Did you know that, ${fact}?`;
    } else if (feed.includes('boaring') || feed.includes('bored')) {
        response = "Bored?, Sometimes it feels . Don' worry.";
    }
    else if (feed.includes('are beautiful') || feed.includes('nice') || feed.includes('good') || feed.includes("awesome")) {
        response = "Thank you , I appreciate that you like me.";
    }
    else if (feed.includes('me jokes') || feed.includes('jokes')) {
        const randomIndex = Math.floor(Math.random() * dirtyJokes.length);
        const jokes = dirtyJokes[randomIndex];
        response = jokes;
    } else if (feed.includes('next') || feed.includes('another')) {
        response = "Next, what???";
    } else if (feed.includes('made you') || feed.includes('create') || feed.includes("build") || feed.includes("make")) {
        response = "I am a small project of my Boss, Mr.Nishant Thapa";
    }
    else if (feed.includes('bye')) {
        response = "Goodbye! Have a great day!";
    } else {
        response = "Please feed me correctly! Otherwise I don't understand";
    }

    document.getElementById("greeting-text").textContent = response;


    // triggers the animation

    document.querySelector(".greet").classList.add("animate");
    document.querySelector(".bubble").classList.add("animate");

    //clearing the input fields
    document.getElementById("nameInput").value = "";

    const box = document.getElementById("greet-id");
    // Remove animation class
    box.classList.remove("greet");

    void box.offsetWidth; // This line forces the browser to reflow the element
    // Add animation class back after a short delay
    setTimeout(() => {
        box.classList.add("greet");
    }, 10);


    // this is i want to clear the userInput after 8sec . This means this block is executed after 8sec. same like time.sleep() in python
    setTimeout(function () {
        document.getElementById("greeting-text").textContent = '';
    }, 7000);
}


