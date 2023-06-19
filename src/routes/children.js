const express = require('express')
const router = express.Router();

const childrenController = require('../controllers/children');


router.post('/children', childrenController.sendData);
router.get("/children",childrenController.data)
module.exports = router;