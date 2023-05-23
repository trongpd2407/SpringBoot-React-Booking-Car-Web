
import './App.css';
import Navbar from './layout/Navbar';
import 'bootstrap/dist/css/bootstrap.min.css'
import Home from './pages/Home';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import ListUser from './components/user/ListUser';
import AddUser from './components/user/AddUser';
import Login from './components/Login'
import Registration from './components/Registration'
import EditUser from './components/user/EditUser';
import Footer from './layout/Footer';
import BookingCar from './components/BookingCar';

function App() {
    
    return (
        <div className='App'>
           
            <Router>
                <Navbar/>
                <Routes>
                    
                    <Route path='/home' element={<Home/>}></Route>
                    <Route path='/manage_user/list_user' element={<ListUser/>}></Route>
                    <Route path='/manage_user/add_user' element={<AddUser/>}></Route>
                    <Route path='/login' element={<Login/>}></Route>
                    <Route path='/booking_car' element={<BookingCar/>}></Route>
                    <Route path='/registration' element={<Registration/>}></Route>
                    <Route path='/manage_user/edit_user/:id' element={<EditUser/>}></Route>
                </Routes>
                <Footer/>
            </Router>
            
            
        </div>

    );
}

export default App;
