import MovieCards from 'components/MovieCards';
import MovieScore from 'components/MovieScore';
import MovieStars from 'components/MovieStars';
import Pagination from 'components/Pagination';
import React, { Component } from 'react';

function Listing() {
    return (
        <>
            <Pagination />

            <div className='container'>
                <div className='row'>
                    <div className='col-sm-6 col-lg-4 col-xl-3 mb-3'>
                        <MovieCards />
                    </div>

                    <div className='col-sm-6 col-lg-4 col-xl-3 mb-3'>
                        <MovieCards />
                    </div>

                    <div className='col-sm-6 col-lg-4 col-xl-3 mb-3'>
                        <MovieCards />
                    </div>

                    <div className='col-sm-6 col-lg-4 col-xl-3 mb-3'>
                        <MovieCards />
                    </div>
                </div>
            </div>
        </>
    );
}

export default Listing;
