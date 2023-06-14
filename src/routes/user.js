const express = require('express');
const router = express.Router();
const userControllers = require('../controllers/user')

router.get('/users', userControllers.getAllUser);

//find user by id
router.get('/users/:userId', userControllers.getUserById)

//find user by name and age
router.get('/users/user-by-name-and-age', userControllers.getUserByNameAndAge)

//create user
router.post('/users', userControllers.createUser)

//create many users
router.post('/createManyUser', userControllers.createManyUser)

module.exports = router;