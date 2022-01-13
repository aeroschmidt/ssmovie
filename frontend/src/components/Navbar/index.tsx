import { ReactComponent as GitHubIcon } from 'assets/img/github.svg';
import React, { Component } from 'react';
import './styles.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="ssmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/aeroschmidt/ssmovie" target="_blank" rel="noreferrer">
                        <div className="ssmovie-contact-container">
                            <GitHubIcon />
                            <p className="ssmovie-contact-link">/devsuperior</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;