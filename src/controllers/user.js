const user = [
    
    { name: 'Nhat', age: 19 },
    { name: 'Minh', age: 15 }
]

function getAllUser(req, res) {
    res.send([
        { name: 'Nhat', age: 19 },
        { name: 'Minh', age: 15 }
    ]);
};

//http://localhost:3000/v1/getUser/10
function getUserById(req, res) {
    const userId = req.params.userId;
    console.log('userID: ', userId);
    res.send({ userId });
}

//http://localhost:3000/v1/getUserByNameAndAge?name=nhat&age=18
function getUserByNameAndAge(req, res) {
    const { name, age } = req.query;
    console.log("Name: ", name);
    console.log("Age: ", age);
    res.send({
        name, age
    })
}


function createUser(req, res) {
    const { username, password, age } = req.body;
    res.send({
        username,
        password,
        age
    })
}

const createManyUser = (req, res) => {
    const ManyUser = req.body
    const newUser = [...user, ...ManyUser]
    res.send(newUser)

}

module.exports = {
    getAllUser,
    getUserById,
    getUserByNameAndAge,
    createUser,
    createManyUser
}