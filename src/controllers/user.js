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

//http://localhost:3000/v1/users/10
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

//Thêm mới 1 user 
//Add vào 1 middware check các điều kiện sau
//Kiếm tra req.body.username không vượt quá 20 kí tự
//Kiếm tra req.bodu.password không vượt quá 8 kí tự
function validate(req, res, next){
    const { username, password } =req.body;
    if(username.lenght>8 ){
        next("Không nhập kí tự vượt quá 20")
    }
}



module.exports = {
    getAllUser,
    getUserById,
    getUserByNameAndAge,
    createUser,
    createManyUser
}